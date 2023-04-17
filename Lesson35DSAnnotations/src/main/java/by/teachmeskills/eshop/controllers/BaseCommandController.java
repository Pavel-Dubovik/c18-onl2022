package by.teachmeskills.eshop.controllers;

import by.teachmeskills.eshop.model.PagesPath;

import javax.servlet.http.HttpServletRequest;

public interface BaseCommandController {

    PagesPath execute(HttpServletRequest request) throws Exception;
}
