package com.morpho.morphosmart.sdk;

/**
 * 
 * This class represent the finger template used or generated during a
 * Capture/Enroll/Verify/Identify operation. 
 *
 */
public class Template
{
	private ITemplateType iTemplateType;
	private byte [] data;
	private int dataIndex = 0xFF;
	private int templateQuality;
	
	/**
	 * Retrieve data of the current Template object.
	 * @param None
	 * @return Data of the current Template object
	 */
	public byte [] getData() {
		return data;
	}
	
	/**
	 * Set data of the current Template object.
	 * @param data input data
	 * @return None
	 */
	public void setData(byte [] data) {
		this.data = data;
	}
	
	/**
	 * 
	 * @param data
	 */
	@SuppressWarnings("unused") //used in jni
	private void setData(Object data) {
		this.data = (byte[]) data;
	}
	
	/**
	 * Retrieve data index of the current Template object.
	 * @param None
	 * @return index of the current Template object
	 */
	public int getDataIndex() {
		return dataIndex;
	}
	
	/**
	 * Set data index of the current Template object.
	 * @param dataIndex input data index
	 * @return None
	 */
	public void setDataIndex(int dataIndex) {
		this.dataIndex = dataIndex;
	}
	
	/**
	 * Retrieve quality of the current Template object.
	 * @param None
	 * @return Quality of the current Template object
	 */
	public int getTemplateQuality() {
		return templateQuality;
	}
	
	/**
	 * Set quality of the current Template object.
	 * @param templateQuality input quality
	 * @return None
	 */
	public void setTemplateQuality(int templateQuality) {
		this.templateQuality = templateQuality;
	}
	
	/**
	 * Retrieve type of the current Template object.
	 * @param None
	 * @return Type of the current Template object
	 */
	public TemplateType getTemplateType() {
		return (TemplateType)iTemplateType;
	}
	
	/**
	 * Retrieve type of the current Template object if it's a an FVP template.
	 * @param None
	 * @return Type of the current Template object
	 */
	public TemplateFVPType getTemplateFVPType() {
		return (TemplateFVPType)iTemplateType;
	}
	
	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unused") //used in jni
	private int getTemplateTypeIntValue() {
			return ((TemplateType)iTemplateType).getCode();
	}
	
	/**
	 * Set the type of the current Template object.
	 * @param templateType the templateType to set
	 * @return None
	 */
	public void setTemplateType(TemplateType templateType) {
		this.iTemplateType = templateType;
	}
	
	/**
	 * Set the type of the current Template object if it's a an FVP template.
	 * @param templateFVPType the templateType to set
	 * @return None
	 */
	public void setTemplateFVPType(TemplateFVPType templateFVPType) {
		this.iTemplateType = templateFVPType;
	}
	
	/**
	 * Set the type of the current Template object
	 * @param id identifier of a template type
	 * @return None
	 */
	public void setTemplateType(int id) {
		this.iTemplateType = TemplateType.getValue(id);
	}	
	

	/**
	 * Set the type of the current Template object if it's a an FVP template.
	 * @param id identifier of a template type
	 * @return None
	 */
	public void setTemplateFVPType(int id) {
		this.iTemplateType = TemplateFVPType.getValue(id);
	}	
}
