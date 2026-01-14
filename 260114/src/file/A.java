package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;

public class A {
    void a() {	
    	FileWriter fw = null;
    	try {
    	    fw = new FileWriter("C:\\Users\\user\\Desktop\\output.txt"); // 1. 열기
    	 
    	    fw.write("Hello World");
    	} catch (IOException e) {
    	    e.printStackTrace();
    	} finally {
    	    try {
    	        fw.close(); // 2. 닫기 (개발자가 까먹으면 큰일남, 코드도 복잡함)
    	    } catch (IOException e) { e.printStackTrace(); 
    	    }
    	}
    }
    void a2() {
        try (FileReader reader = new FileReader("output.txt")) {
            char[] buffer = new char[1024];
            int charsRead;
            
            // 파일 내용을 1024글자씩 끊어서 읽어옵니다
            while ((charsRead = reader.read(buffer)) != -1) {
                // 읽은 만큼만 문자열로 바꿔서 출력
                System.out.print(new String(buffer, 0, charsRead));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void a3() {
        try (
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr)
        ) {
            String line;
            int lineNumber = 1;

            // 한 줄씩(readLine) 읽어옵니다
            while ((line = br.readLine()) != null) {
                // %3d: 3자리 공간 확보한 숫자, %s: 문자열(파일 내용), %n: 줄바꿈
                System.out.printf("%3d: %s%n", lineNumber, line);
                
                lineNumber++; // 줄 번호 증가
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyBinaryFile(String sourceFile, String destFile) {
    	System.out.println("====바이너리 파일 복사====");
    	
    	try (
    			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 8192);
    			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile), 8192)
    		) {
    		byte[] buffer = new byte[8192];
    		int bytesRead;
    		while ((bytesRead = bis.read(buffer)) != -1) {
    			bos.write(buffer, 0, bytesRead);
    		}
    			System.out.println("바이너리 파일 복사 완료");
    		} catch (IOException e) {
    			e.printStackTrace();
    	}
    }
    
    void a4() {
    	Path p = Paths.get("C:/temp/file.txt");
    	String str = p.getFileName().toString();
    	System.out.print(str);
    }
    void a5() {
    	try {
    	Path p = Paths.get("C:/a");
    	Files.createDirectory(p);
    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    }
