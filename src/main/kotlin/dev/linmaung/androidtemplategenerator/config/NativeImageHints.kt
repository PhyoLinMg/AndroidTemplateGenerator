package dev.linmaung.androidtemplategenerator.config

import dev.linmaung.androidtemplategenerator.controller.TemplateGenerationController
import dev.linmaung.androidtemplategenerator.generator.dependency.DependencyInfo
import dev.linmaung.androidtemplategenerator.generator.dependency.LibraryConstant
import dev.linmaung.androidtemplategenerator.generator.dependency.LibraryRequirement
import dev.linmaung.androidtemplategenerator.generator.dependency.ModuleInfo
import dev.linmaung.androidtemplategenerator.generator.dependency.PluginRequirement
import dev.linmaung.androidtemplategenerator.generator.dependency.Plugins
import dev.linmaung.androidtemplategenerator.generator.dependency.VersionConstant
import dev.linmaung.androidtemplategenerator.generator.dependency.VersionRequirement
import dev.linmaung.androidtemplategenerator.service.ProjectGenerator
import org.springframework.aot.hint.MemberCategory
import org.springframework.aot.hint.RuntimeHints
import org.springframework.aot.hint.RuntimeHintsRegistrar
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportRuntimeHints

@Configuration
@ImportRuntimeHints(ToolsRuntimeHints::class)
class NativeConfiguration

class ToolsRuntimeHints : RuntimeHintsRegistrar {
    override fun registerHints(hints: RuntimeHints, classLoader: ClassLoader?) {
        // Register JCTools queue classes for Netty
        val classesToRegister = listOf(
            // JCTools queue classes
            "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
            "io.netty.util.internal.shaded.org.jctools.queues.BaseMpscLinkedArrayQueue",
            "io.netty.util.internal.shaded.org.jctools.queues.MpscUnpaddedArrayQueue",
            "io.netty.util.internal.shaded.org.jctools.queues.MpscChunkedArrayQueue",
            "io.netty.util.internal.shaded.org.jctools.queues.unpadded.MpscUnpaddedArrayQueueProducerFields",
            "io.netty.util.internal.shaded.org.jctools.queues.unpadded.MpscUnpaddedArrayQueueProducerIndexField",
            "io.netty.util.internal.shaded.org.jctools.queues.unpadded.MpscUnpaddedArrayQueueConsumerFields",
            "io.netty.util.internal.shaded.org.jctools.queues.unpadded.MpscUnpaddedArrayQueueConsumerIndexField",
            "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
            "io.netty.util.internal.shaded.org.jctools.queues.unpadded.MpscUnpaddedArrayQueueProducerLimitField",



            // Netty channel handlers and related classes
            "io.netty.channel.ChannelInboundHandler",
            "io.netty.channel.ChannelOutboundHandler",
            "io.netty.channel.AbstractChannelHandlerContext",
            "io.netty.channel.DefaultChannelPipeline\$HeadContext",
            "io.netty.channel.DefaultChannelPipeline\$TailContext",
            "io.netty.handler.codec.ByteToMessageDecoder",
            "io.netty.channel.CombinedChannelDuplexHandler",
            "io.netty.channel.socket.nio.NioSocketChannel",
            "io.netty.channel.socket.nio.NioServerSocketChannel",
            "io.netty.channel.nio.AbstractNioChannel",
            "io.netty.channel.nio.AbstractNioByteChannel",
            "io.netty.channel.nio.NioEventLoop",
            "io.netty.util.concurrent.SingleThreadEventExecutor",
            "io.netty.util.internal.ThreadExecutorMap",
            "io.netty.util.concurrent.FastThreadLocalRunnable",
            "reactor.netty.http.server.HttpTrafficHandler",
            "io.netty.handler.codec.http.HttpServerCodec",
            "io.netty.handler.codec.http.HttpObjectAggregator",
            "io.netty.handler.codec.http.HttpContentCompressor"
        )

        classesToRegister.forEach { className ->
            try {
                val clazz = Class.forName(className, false, classLoader)
                hints.reflection().registerType(
                    clazz,
                    MemberCategory.DECLARED_FIELDS,
                    MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
                    MemberCategory.INVOKE_DECLARED_METHODS // Added method reflection
                )
            } catch (e: ClassNotFoundException) {
                // Class might not exist in all versions
            }
        }

        // Register Netty buffer allocator
        hints.reflection()
            .registerType(
                Class.forName("io.netty.buffer.PooledByteBufAllocator"),
                MemberCategory.DECLARED_FIELDS,
                MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
                MemberCategory.INVOKE_DECLARED_METHODS
            )

        listOf(
            VersionConstant::class.java,
            LibraryConstant::class.java,
            Plugins::class.java,
            DependencyInfo::class.java,
            VersionRequirement::class.java,
            PluginRequirement::class.java,
            LibraryRequirement::class.java,
            ModuleInfo::class.java,
            ProjectGenerator::class.java,
            freemarker.template.Configuration::class.java,
            TemplateGenerationController::class.java
        ).forEach { clazz ->
            hints.reflection().registerType(
                clazz,
                MemberCategory.DECLARED_FIELDS,
                MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
                MemberCategory.INVOKE_DECLARED_METHODS
            )
        }
        try {
            val fileClass = Class.forName(
                "dev.linmaung.androidtemplategenerator.generator.dependency.dependencyRegistryKt",
                false,
                classLoader
            )
            hints.reflection().registerType(
                fileClass,
                MemberCategory.DECLARED_FIELDS,
                MemberCategory.INVOKE_DECLARED_METHODS
            )
        } catch (e: ClassNotFoundException) {
            // Class might have different name
        }


        hints.resources().registerPattern("templates/**")
    }
}