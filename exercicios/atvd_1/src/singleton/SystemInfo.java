package singleton;

public class SystemInfo {

private static SystemInfo instance;
	
	private String theme;
	private String language;
	private Integer fontSize;
	
	private SystemInfo() {
		this.theme = theme;
		this.language = language;
		this.fontSize = fontSize;
	}
	
	public static SystemInfo getInstance() {
		if (instance == null) return instance = new SystemInfo();
		return instance;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getFontSize() {
		return fontSize;
	}

	public void setFontSize(Integer fontSize) {
		this.fontSize = fontSize;
	}
	
}
