package com.example.application;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.webcomponent.WebComponent;

public class HelloWorld extends VerticalLayout {

    public static class HelloWorldExporter extends WebComponentExporter<HelloWorld> {

        public HelloWorldExporter() {
            super("hello-world");
        }

        @Override
        protected void configureInstance(WebComponent<HelloWorld> webComponent, HelloWorld component) {

        }

    }

    public HelloWorld() {
        add(new Text("Hello world"));
    }
}
