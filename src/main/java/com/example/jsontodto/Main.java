package com.example.jsontodto;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode node = mapper.readTree(new File("sample.json"));
			String name = node.get("results").get("shop").get(0).get("name").asText();
			System.out.println(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
