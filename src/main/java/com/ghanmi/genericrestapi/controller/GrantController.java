package com.ghanmi.genericrestapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghanmi.genericrestapi.model.Grant;

@RestController
@RequestMapping("/grants")
public class GrantController extends GenericRestController<Grant> {

}
