import java.util.Scanner;

public class Register{
	public static void main(String[] args) {
		Felisha();
		Prompt();
		Policy();
		
	}
	public static void Prompt() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\t\tWELCOME TO BYE-FELISHA! SPAM CALL BLOCKER");
		System.out.print("\nPlease enter your name: ");
		String name = sc.nextLine();
		System.out.print("Please enter your phone number: ");
		 long num = sc.nextLong();
		
		
	}
	static void Felisha() {
		System.out.println("  		     ██╗██████╗ ██╗   ██╗███████╗    ███████╗███████╗██╗     ██╗███████╗██╗  ██╗ █████╗ ██╗██╗██╗                   \r\n" + 
				"                    ██╔╝██╔══██╗╚██╗ ██╔╝██╔════╝    ██╔════╝██╔════╝██║     ██║██╔════╝██║  ██║██╔══██╗██║██║╚██╗                  \r\n" + 
				"                    ██║ ██████╔╝ ╚████╔╝ █████╗      █████╗  █████╗  ██║     ██║███████╗███████║███████║██║██║ ██║                  \r\n" + 
				"                    ██║ ██╔══██╗  ╚██╔╝  ██╔══╝      ██╔══╝  ██╔══╝  ██║     ██║╚════██║██╔══██║██╔══██║╚═╝╚═╝ ██║                  \r\n" + 
				"                    ╚██╗██████╔╝   ██║   ███████╗    ██║     ███████╗███████╗██║███████║██║  ██║██║  ██║██╗██╗██╔╝                  \r\n" + 
				"                     ╚═╝╚═════╝    ╚═╝   ╚══════╝    ╚═╝     ╚══════╝╚══════╝╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚═╝╚═╝                   \r\n" + 
				"                                                                                                                                    \r\n" + 
				"███████╗██████╗  █████╗ ███╗   ███╗     ██████╗ █████╗ ██╗     ██╗         ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗███████╗██████╗ \r\n" + 
				"██╔════╝██╔══██╗██╔══██╗████╗ ████║    ██╔════╝██╔══██╗██║     ██║         ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝██╔════╝██╔══██╗\r\n" + 
				"███████╗██████╔╝███████║██╔████╔██║    ██║     ███████║██║     ██║         ██████╔╝██║     ██║   ██║██║     █████╔╝ █████╗  ██████╔╝\r\n" + 
				"╚════██║██╔═══╝ ██╔══██║██║╚██╔╝██║    ██║     ██╔══██║██║     ██║         ██╔══██╗██║     ██║   ██║██║     ██╔═██╗ ██╔══╝  ██╔══██╗\r\n" + 
				"███████║██║     ██║  ██║██║ ╚═╝ ██║    ╚██████╗██║  ██║███████╗███████╗    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗███████╗██║  ██║\r\n" + 
				"╚══════╝╚═╝     ╚═╝  ╚═╝╚═╝     ╚═╝     ╚═════╝╚═╝  ╚═╝╚══════╝╚══════╝    ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝\r\n" + 
				"                                                                                                                                    \r\n" + 
				"                                                                                                                                    \r\n" + 
				"                                                                                          ");
	}
	static void Thanks() {
		System.out.println("  _____ _   _    _    _   _ _  __ __   _____  _   _  \r\n" + 
				" |_   _| | | |  / \\  | \\ | | |/ / \\ \\ / / _ \\| | | | \r\n" + 
				"   | | | |_| | / _ \\ |  \\| | ' /   \\ V / | | | | | | \r\n" + 
				"   | | |  _  |/ ___ \\| |\\  | . \\    | || |_| | |_| | \r\n" + 
				"   |_| |_| |_/_/   \\_\\_| \\_|_|\\_\\   |_| \\___/ \\___(_)\r\n" + 
				"                                                     ");
	}
	
	static void Policy() {
		Scanner in = new Scanner(System.in);

		System.out.println("\n\n\t\t\tTO VIEW OUR USER AGREEMENT POLICY PLEASE PRESS 'V'");
		String choice = in.nextLine();
		
		if(choice.equals("v") || choice.equals("V")){
			Agreement();
		}
		
		System.out.println("\n\n\t\t\tPLEASE READ OUR AGREEMENT POLICY CAREFULLY.\nIF YOU ACCEPT OUR POLICY , PRESS 'Y'");
		String choice_0 = in.nextLine();
		
		if(choice_0.equals("Y") || choice_0.equals("y")) {
			Thanks();
		}
		
		
	}
	
	
	static void Agreement() {
		System.out.println("State of Texas\r\n" + 
				"\r\n" + 
				"Rev. 133EF48\r\n" + 
				"\r\n" + 
				"END USER LICENSE AGREEMENT\r\n" + 
				"\r\n" + 
				"This End-User License Agreement (this \"EULA\") is a legal agreement between you (\"Licensee\") and\r\n" + 
				"JANSL (\"Licensor\"), the author of Bye Felicia! Spam Call Blocker, including all HTML files, XML files,\r\n" + 
				"Java files, graphics files, animation files, data files, technology, development tools, scripts and programs,\r\n" + 
				"both in object code and source code (the \"Software\"), the deliverables provided pursuant to this EULA,\r\n" + 
				"which may include associated media, printed materials, and \"online\" or electronic documentation,\r\n" + 
				"\r\n" + 
				"By installing, copying, or otherwise using the Software, Licensee agrees to be bound by the terms and\r\n" + 
				"conditions set forth in this EULA. If Licensee does not agree to the terms and conditions set forth in this\r\n" + 
				"EULA, then Licensee may not download, install, or use the Software.\r\n" + 
				"\r\n" + 
				"1. Grant of License\r\n" + 
				"\r\n" + 
				"A) Scope of License. Subject to the terms of this EULA. Licensor hereby grants to Licensee a\r\n" + 
				"royalty-free, non-exclusive license to possess and to use a copy of the Software.\r\n" + 
				"\r\n" + 
				"B) Insallation and Use. Licensee may install and use an unlimited number of copies of the Software\r\n" + 
				"solely see's business and personal use.\r\n" + 
				"2. Description\r\n" + 
				"Rights and Limitations\r\n" + 
				"A) Limitations. Licensee and third parties may not reverse engineer, decompile, or disassemble the\r\n" + 
				"Software, except and only to the extent that such activity is expressly permitted by applicable law\r\n" + 
				"notwithstanding the limitation.\r\n" + 
				"B) Update and Maintenance. Licensor shall provide updates and maintenance on the Software every\r\n" + 
				"6 months.\r\n" + 
				"\r\n" + 
				"Close Preview\r\n" + 
				"\r\n" + 
				"C) Separation of Components. The Software is licensed as a single product. Its components may\r\n" + 
				"not be separated for use on more than one computer.\r\n" + 
				"\r\n" + 
				"3. Title to Software. Licensor represents and warrants that it has the legal right to enter into and perform\r\n" + 
				"its obligations under this EULA, and that use by the Licensee of the Software, in accordance with the\r\n" + 
				"terms of this EULA, will not infringe upon the intellectual property rights of any third parties.\r\n" + 
				"\r\n" + 
				"4. Intellectual Property. All now known or hereafter known tangible and intangible rights, title, interest\r\n" + 
				"copyrights and moral rights in and to the Software, including but not limited to all images, photographs,\r\n" + 
				"animations, video, audio, music, text, data, computer code, algorithms, and information, are owned by\r\n" + 
				"Licensor. The Software is protected by all applicable copyright laws and international treaties.\r\n" + 
				"\r\n" + 
				"5. Support. Licensor will provide phone support, available during normal business hours for a time\r\n" + 
				"period of 1 year.\r\n" + 
				"\r\n" + 
				"6. Duration. This EULA is perpetual or until:\r\n" + 
				"\r\n" + 
				"A) Automatically terminated or suspended if Licensee fails to comply with any of the terms and\r\n" + 
				"conditions set forth in this EULA: or\r\n" + 
				"\r\n" + 
				"B) Terminated or suspended by Licensor, with or without cause.\r\n" + 
				"\r\n" + 
				"In the event this EULA is terminated, you must cease use of the Software and destroy all copies of the\r\n" + 
				"Software\r\n" + 
				"\r\n" + 
				"7. Jurisdiction. This EULA shall be deemed to have been made in, and shall be construed pursuant to\r\n" + 
				"the laws of the State of Texas, without regard to conflicts of laws provisions thereof. Any legal action or\r\n" + 
				"proceeding relating to this EULA shall be brought exclusively in courts located in Lubbock, TX, and each\r\n" + 
				"party consents to the jurisdiction thereof. The prevailing party in any action to enforce this EULA shall be\r\n" + 
				"entitled to recover costs and expenses including, without limitation, attorneys' fees. This EULA Is made\r\n" + 
				"within the exclusive jurisdiction of the United States, and its jurisdiction shall supersede any other\r\n" + 
				"jurisdiction of either party's election.\r\n" + 
				"\r\n" + 
				"8. Non-Transferable. This EULA is not assignable or transferable by Licensee without the prior written\r\n" + 
				"consent of Licensor, and any attempt to do so shall be cold.\r\n" + 
				"\r\n" + 
				"9. Sevel No failure to exercise, and no delay in exercising, on the part of either party, any\r\n" + 
				"privilege nower or any rights hereunder will operate as a waiver thereof, nor will any single or partial\r\n" + 
				"exercise oasv right or power hereunder preclude further exercise of any other right hereunder. If any\r\n" + 
				"provision f nis EULA shall be adjudged by any court of competent jurisdiction to be unenforceable or\r\n" + 
				"invalid, that provision shall be limited or eliminated to the minimum extent necessary so that this EULA\r\n" + 
				"shall otherwise remain in full force and effect and enforceable.\r\n" + 
				"\r\n" + 
				"10. WARRANTY DISCLAIMER. LICENSOR, AND AUTHOR OF THE SOFTWARE, HEREBY\r\n" + 
				"EXPRESSLY DISCLAIM ANY WARRANTY FOR THE SOFTWARE. THE SOFTWARE AND ANY\r\n" + 
				"RELATED DOCUMENTATION IS PROVIDED \"AS IS\" WITHOUT WARRANTY OF ANY KIND, EITHER\r\n" + 
				"EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION. THE IMPLIED WARRANTIES OF\r\n" + 
				"MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT.\r\n" + 
				"LICENSEE ACCEPTS ANY AND ALL RISK ARISING OUT OF USE OR PERFORMANCE OF THE\r\n" + 
				"SOFTWARE\r\n" + 
				"\r\n" + 
				"11. LIMITATION OF LIABILITY. LICENSOR SHALL NOT BE LIABLE TO LICENSEE, OR ANY OTHER\r\n" + 
				"PERSON OR ENTITY CLAIMING THROUGH LICENSEE ANY LOSS OF PROFITS, INCOME,\r\n" + 
				"SAVINGS, OR ANY OTHER CONSEQUENTIAL, INCIDENTAL, SPECIAL, PUNITIVE, DIRECT OR\r\n" + 
				"INDIRECT DAMAGE, WHETHER ARISING IN CONTRACT, TORT, WARRANTY, OR OTHERWISE.\r\n" + 
				"THESE LIMITATIONS SHALL APPLY REGARDLESS OF THE ESSENTIAL PURPOSE OF ANY\r\n" + 
				"LIMITED REMEDY. UNDER NO CIRCUMSTANCES SHALL LICENSOR'S AGGREGATE LIABILITY TO\r\n" + 
				"2/3\r\n" + 
				"End User License Agreement (Rev. 133EF48)\r\n" + 
				"\r\n" + 
				"LICENSEE, OR ANY OTHER PERSON OR ENTITY CLAIMING THROUGH LICENSEE, EXCEED THE\r\n" + 
				"FINANCIAL AMOUNT ACTUALLY PAID BY LICENSEE TO LICENSOR FOR THE SOFTWARE.\r\n" + 
				"\r\n" + 
				"12. Entire Agreement. This EULA constitutes the entire agreement between Licensor and Licensee and\r\n" + 
				"supersedes all prior understandings of Licensor and Licensee, including any prior representation,\r\n" + 
				"statement, condition, or warranty with respect to the subject matter of this EULA.\r\n" + 
				"");
	}
}
