package com.ghanmi.genericrestapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghanmi.genericrestapi.model.Role;

@RestController
@RequestMapping("/roles")
public class RoleController extends GenericRestController<Role> {

}
