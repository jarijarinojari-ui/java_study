package jenerick;

//재료 클래스들 (그냥 두시면 됩니다)
class Plastic {
 public void doPrinting() { System.out.println("플라스틱 재료로 출력합니다."); }
}
class Powder {
 public void doPrinting() { System.out.println("파우더 재료로 출력합니다."); }
}

//[문제 1] 아래 클래스를 제네릭 클래스로 바꿔보세요. (현재는 Object로 되어 있음)
class GenericPrinter<T> { // <--- 여기를 바꿔보세요!
 private T material; // <--- 여기 타입도 바꿔야겠죠?

 public void setMaterial(T material) { // <--- 파라미터 타입 수정
     this.material = material;
 }

 public T getMaterial() { // <--- 리턴 타입 수정
     return material;
 }
}

 public class Main {
 public static void main(String[] args) {
     // [문제 2] GenericPrinter를 사용하여 Plastic을 재료로 쓰는 프린터를 만들어보세요.
     // 힌트: GenericPrinter<Plastic> ...
     GenericPrinter<Plastic> p1 = new GenericPrinter<>(); 
     
     p1.setMaterial(new Plastic());
     
     // [문제 3] 꺼낼 때 형변환 없이 꺼내보세요. (제네릭을 적용하면 (Plastic) 형변환이 필요 없습니다)
     Plastic plastic = p1.getMaterial(); 
     plastic.doPrinting();
 }
}
