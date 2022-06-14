package com.example.appauthorization.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class ResourceNotFoundException : RuntimeException() {
    var resourceName: String? = null
    var fieldName: String? = null
    var fieldValue: Long = 0
}