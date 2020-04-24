package com.exemplo.kotlinJava.kotlinController

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test-kotlin")
class testKotlinController {

    @GetMapping
    fun consultar():String = "Controller em kotlin"

}