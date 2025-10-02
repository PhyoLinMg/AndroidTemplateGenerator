package dev.linmaung.androidtemplategenerator.controller

import ProjectGenerator
import dev.linmaung.androidtemplategenerator.model.basic.BasicRequest
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/templates")
class TemplateGenerationController(
    private val generator: ProjectGenerator
) {
    @GetMapping("/health")
    fun healthCheck(): ResponseEntity<String> {
        return ResponseEntity.ok("API is running")
    }

    @PostMapping("/basic/generate", produces = [MediaType.APPLICATION_OCTET_STREAM_VALUE])
    fun generateBasic(@RequestBody request: BasicRequest): ResponseEntity<ByteArray> {
        return try {
            val zipBytes = generator.generateBasic(request)
            ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"${request.projectName}.zip\"")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE)
                .header(HttpHeaders.CONTENT_LENGTH, zipBytes.size.toString())
                .body(zipBytes)
        } catch (e: Exception) {
            // Log the error for debugging
            e.printStackTrace()
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
        }
    }

//    @PostMapping("/advanced/generate", produces = [MediaType.APPLICATION_OCTET_STREAM_VALUE])
//    fun generateAdvanced(@RequestBody request: BasicRequest): ResponseEntity<ByteArray> {
//
//    }
//
//    @PostMapping("/intermediate/generate", produces = [MediaType.APPLICATION_OCTET_STREAM_VALUE])
//    fun generateAdvanced(@RequestBody request: BasicRequest): ResponseEntity<ByteArray> {
//
//    }
}

data class TestRequest(
    val projectName: String,
    val packageName: String
)