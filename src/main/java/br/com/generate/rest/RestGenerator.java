package br.com.generate.rest;


import java.io.IOException;

import br.com.generate.Layers;
import br.com.generate.ReadTemplateFile;

public class RestGenerator extends ReadTemplateFile {
	
	@Override
	public String getLayer() {
		return Layers.REST;
	}

	@Override
	protected String operationGenerate(String javaStrings, String nameClass,
			String parameters) {
		
		
		
		return null;
	}

	

}
