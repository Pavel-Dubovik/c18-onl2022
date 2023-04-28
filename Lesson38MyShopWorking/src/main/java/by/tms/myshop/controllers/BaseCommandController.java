package by.tms.myshop.controllers;

import by.tms.myshop.model.PagesPath;
import jakarta.servlet.http.HttpServletRequest;

public interface BaseCommandController {

    PagesPath execute(HttpServletRequest request) throws Exception;
}