package com.juahya.guis;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xml.inflate.inflater.IJuahya;

/**
 * 能够被解析成Juahya的TextView
 * @see IJuahya juahya接口
 * @see com.xml.inflate.inflater.juahya.IFJTextView    
 * */
public class JLinearlayout extends LinearLayout implements IJuahya{


	
	protected String attrKey;
	protected String attrDescription;
	protected String attrType;
	
	public void setAttrType(String attrType) {
		this.attrType = attrType;
	}
	public String getAttrKey() {
		return attrKey;
	}

	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrDescription() {
		return attrDescription;
	}

	public void setAttrDescription(String attrDescription) {
		this.attrDescription = attrDescription;
	}

	public JLinearlayout(Context context) {
		super(context);
	}

	public JLinearlayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public JLinearlayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public String getValue() {
		return "";
	}

	@Override
	public String getAttrType() {
		return attrType;
	}

	
	
}
