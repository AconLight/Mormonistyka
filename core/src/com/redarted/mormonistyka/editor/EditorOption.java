package com.redarted.mormonistyka.editor;

import com.redarted.mormonistyka.objects.GameObject;

public class EditorOption {

	private EditorOptionInterface editorOptionInterface;
	private String name;
	
	public EditorOption(String name, EditorOptionInterface editorOptionInterface) {
		this.name = name;
		this.editorOptionInterface = editorOptionInterface;
	}
	
	public void execute(GameObject obj) {
		editorOptionInterface.execute(obj);
	}
}
