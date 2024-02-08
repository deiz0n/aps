package singleton;

public class Program {

	public static void main(String[] args) {
		
		var systemInfo = SystemInfo.getInstance();
		
		systemInfo.setTheme("light");
		systemInfo.setLanguage("en-ca");
		systemInfo.setFontSize(22);
		
		System.out.println("Theme: " + systemInfo.getTheme());
		System.out.println("Language: " + systemInfo.getLanguage());
		System.out.println("Font Size: " + systemInfo.getFontSize());
		System.out.println("Instance: " + systemInfo);
		
		var system = SystemInfo.getInstance();
		
		system.setTheme("dark");
		system.setLanguage("en-us");
		system.setFontSize(13);
		
		System.out.println("----------------------------------------");
		System.out.println("Theme: " + system.getTheme());
		System.out.println("Language: " + system.getLanguage());
		System.out.println("Font Size: " + system.getFontSize());
		System.out.println("Instance: " + system);
		
	}
	
}
