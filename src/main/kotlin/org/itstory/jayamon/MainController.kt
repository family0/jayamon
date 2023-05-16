package org.itstory.jayamon

import jakarta.servlet.http.HttpServletRequest
import mu.KotlinLogging
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
    private val logger = KotlinLogging.logger {}

    @GetMapping("/")
    fun main(model: Model, rq: HttpServletRequest): String {
        logger.info { "GET / ${rq.remoteAddr}" }
        return "main"
    }
}