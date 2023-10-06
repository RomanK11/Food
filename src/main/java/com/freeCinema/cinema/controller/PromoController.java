package com.freeCinema.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromoController {

    @GetMapping("/promo")
    public String getPromo() {
        return "promo";
    }
}