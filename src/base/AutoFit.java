package base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class AutoFit {

	public String path;
	public String output;
	
	public  AutoFit(String path, String output) {
		this.path = path;
		this.output = output;
		
	}
	
	
	public void start(String path, String output) throws IOException {
		//获取path中的一级目录中的所有文件的绝对路径
		File dir = new File(path);
		File[] files = dir.listFiles();
		
		String filePath = "";
		
		for (File file : files) {
			if (file.isDirectory()) {
				
			} else {
				filePath = file.getAbsolutePath();

				System.out.println(filePath);
				
				process(file);
			}
		}
	}
	
	
	public int process(File file) throws IOException {
		
		int count = 0;            //缩进数量
		
		BufferedReader br = null;
		String contentOfLine = "";
		String contentOfLine1 = "";
		
		String whatSpec  = "";
		
		String factor1 = "";
		String factor2 = "";
		
		String result = "";
		
		String indicator7172 = "";
		String indicator7374 = "";
		String indicator7576 = "";
		
		String comment1 = "";
		String comment2 = "";
		String comment3 = "";
		
		
		String opearationCode = "";
		String comparation = "";
		
		String[] typeAndValue = new String[2];
		
		File outputFile = new File(this.output);
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true));
		
		
		try {
			br = new BufferedReader(new FileReader(file));
			while (br.ready()) {
				
				contentOfLine = br.readLine();
				contentOfLine1 = contentOfLine + concat(100);
				
				whatSpec         = contentOfLine1.substring( 6,  7).trim().toUpperCase();
				comment1         = contentOfLine1.substring( 7,  8).trim().toUpperCase();
				comment2         = contentOfLine1.substring( 7,  9).trim().toUpperCase();
				comment3         = contentOfLine1.substring( 7, 10).trim().toUpperCase();
				factor1          = contentOfLine1.substring(10, 20).trim().toUpperCase();
				factor2          = contentOfLine1.substring(35, 45).trim().toUpperCase();
				result           = contentOfLine1.substring(47, 57).trim().toUpperCase();
				opearationCode   = contentOfLine1.substring(28, 34).trim().toUpperCase();
				indicator7172    = contentOfLine1.substring(71, 73).trim().toUpperCase();
				indicator7374    = contentOfLine1.substring(73, 75).trim().toUpperCase();
				indicator7576    = contentOfLine1.substring(75, 77).trim().toUpperCase();
				
				if (whatSpec == "H") {
					continue;
				}
				
				if (comment3.equals("***")  ) {
					continue;
				} 
				if (comment2.equals("**" )) {
					continue;
				}
				if (comment1.equals("*" )) {
					bw.write(concat(count) + "// " + contentOfLine1.substring(9).trim() + "\n");
					bw.flush();
					continue;
				}
				
				
				switch (whatSpec) {
				case "F":
					break;
				case "D":
					break;
				case "C":
					 
					switch (opearationCode) {
					case "IF"  :
					case "IFEQ":
					case "IFNE":
					case "IFGT":
					case "IFGE":
					case "IFLT":
					case "IFLE":
					case "SELECT":
					case "DOW":
					case "DOU":
					case "DOWEQ":
					case "DOWGT":
					case "DOWGE":
					case "DOWLT":
					case "DOWLE":
					case "DOUEQ":
					case "DOUGT":
					case "DOUGE":
					case "DOULT":
					case "DOULE":
						count += 1;
						if (opearationCode.equals("IF"  )  ||
							opearationCode.equals("DOW" )  ||	
							opearationCode.equals("DOU" )  ||	
							opearationCode.equals("SELECT") ) 
						{
							bw.write(concat(count - 1) + contentOfLine1.substring(28,  120).trim() + "\n");
							bw.flush();
							break;
						}else { 
							typeAndValue = compare(opearationCode);
							bw.write(concat(count - 1) + typeAndValue[0] + "   " + factor1 + typeAndValue[1] + contentOfLine1.substring(35,  120).trim() + "\n");
							bw.flush();
							break;
						}
					case "BEGSR":
						count += 1;
						bw.write(concat(count - 1) + "BEGSR" + "    " + factor1 + "\n");
						bw.flush();
						break;
						
					case "AND":
					case "ANDEQ":
					case "ANDGT":
					case "ANDGE":
					case "ANDLT":
					case "ANDLE":
					case "OR":
					case "OREQ":
					case "ORGT":
					case "ORGE":
					case "ORLT":
					case "ORLE":
						if (opearationCode.equals("AND") || opearationCode.equals("OR")) {
							bw.write(concat(count) + contentOfLine1.substring(28,  120).trim() + "\n");
							bw.flush();
							break;
						}else {
							typeAndValue = compare(opearationCode);
							bw.write(concat(count) + typeAndValue[0] + "   " + factor1 + typeAndValue[1] + contentOfLine1.substring(35,  120).trim() + "\n");
							bw.flush();
							break;
						}
						
					case "ELSE":
						bw.write(concat(count -1) + contentOfLine1.substring(28,  120).trim() + "\n");
						bw.flush();
						break;
						
					case "WHEN":
					case "WHENEQ":
					case "WHENGT":
					case "WHENGE":
					case "WHENLT":
					case "WHENLE":
						if (opearationCode.equals("WHEN")) {
							bw.write(concat(count - 1) + contentOfLine1.substring(28,  120).trim() + "\n");
							bw.flush();
							break;
						}else {
							typeAndValue = compare(opearationCode);
							bw.write(concat(count - 1) + typeAndValue[0] + "   " + factor1 + typeAndValue[1] + contentOfLine1.substring(35,  120).trim() + "\n");
							bw.flush();
							break;
						}
						
					case "ENDDO":
					case "ENDIF":
					case "ENDSL":
					case "ENDSR":
					case "END":
						count -= 1;
						bw.write(concat(count) + contentOfLine1.substring(28,  120).trim() + "\n");
						bw.flush();
						break;
					
					case "CHAIN":
					case "CHAIN(E)":
					case "CHAIN(N)":
					case "SETGT":
					case "SETGT(E)":
					case "SETLL":
					case "SETLL(E)":
					case "READ":
					case "READ(E)":
					case "READ(N)":
					case "READC":
					case "READC(E)":
					case "READE":
					case "READE(E)":
					case "READE(N)":
					case "READP":
					case "READP(E)":
					case "READP(N)":
					case "READPE":
					case "READPE(E)":
					case "READPE(N)":
						
					case "Z-ADD":
					case "Z-ADD(H)":
						bw.write(concat(count) + result + "  =  " + factor2.trim() + "\n");
						bw.flush();
						break;
						
					case "Z-SUB":
					case "Z-SUB(H)":
						bw.write(concat(count) + result + "  =  " + factor2.trim() + "\n");
						bw.flush();
						break;
						
					case "ADD":
					case "ADD(H)":
						bw.write(concat(count) + result + "  =  " + result + "  +  "  + factor1 + "  +  " + factor2.trim() + "\n");
						bw.flush();
						break;
						
					case "ADDDUR":
					case "ADDDUR(E)":
						break;
						
					case "CHECK":
					case "CHECK(E)":
						break;
						
					case "DIV":
					case "DIV(H)":
						break;
						
					case "LOOKUP":
						break;
						
					case "MULT":
					case "MULT(H)":
						break;
						
					case "MVR":
						break;
						
					case "OCCUR":
					case "OCCUR(E)":
						break;
					
					case "SCAN":
					case "SCAN(E)":
						break;
						
					case "SUB":
					case "SUB(H)":
						bw.write(concat(count) + result + "  =  " + result + "  +  "  + factor1 + "  -  " + factor2.trim() + "\n");
						bw.flush();
						break;
						
						
					case "MOVE":
					case "MOVEA":
						bw.write(concat(count) + "eval    " + result + "  =  " + factor2.trim() + "\n");
						bw.flush();
						break;
						
					default:
						bw.write(concat(count) + contentOfLine1.substring(28,  120).trim() + "\n");
						bw.flush();
						break;
					}
					break;
				default:
					break;
				}
				 
				
			}
			bw.close();
			br.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return 0;
	}
	
	public String concat(int n) {
		String out = "";
		for (int i = 0; i < n; i++) {
			out += "  ";
		}
		return out;
	}
	
	public String[] compare(String opearationCode) {
		
		String comparation = "";
		String[] typeAndValue = new String[2];
		
		if (opearationCode.substring(0, 2).equals("IF")) {
			typeAndValue[0] = "IF";
			comparation = opearationCode.substring(2, 4);
			
		}
		if (opearationCode.substring(0, 4).equals("WHEN")) {
			typeAndValue[0] = "WHEN";
			comparation = opearationCode.substring(4, 6);
			
		}
		if (opearationCode.substring(0, 3).equals("DOW") || opearationCode.substring(1, 2).equals("DOU")) {
			typeAndValue[0] = opearationCode.substring(0, 3);
			comparation = opearationCode.substring(3, 5);
			
		}
		if (opearationCode.substring(0, 2).equals("OR")) {
			typeAndValue[0] = "OR";
			comparation = opearationCode.substring(2, 4);
			
		}
		if (opearationCode.substring(0, 3).equals("AND")) {
			typeAndValue[0] = "AND";
			comparation = opearationCode.substring(3, 5);
			
		}
		
		if (comparation.equals("EQ")) {
			typeAndValue[1] = " = ";
			return  typeAndValue;
		}
		if (comparation.equals("GT")) {
			typeAndValue[1] = " > ";
			return  typeAndValue;
		}
		if (comparation.equals("GE")) {
			typeAndValue[1] = " >= ";
			return  typeAndValue;
		}
		if (comparation.equals("LT")) {
			typeAndValue[1] = " < ";
			return  typeAndValue;
		}
		if (comparation.equals("LE")) {
			typeAndValue[1] = " <= ";
			return  typeAndValue;
		}
		
		return typeAndValue;
	}
	
	
	public static void main(String[] args) throws IOException {
		// 
		String path = "E:\\sources";
		String output = "E:\\qtemp\\1.txt";
		AutoFit auto = new AutoFit(path, output);
		auto.start(path, output);
		
	}

}
