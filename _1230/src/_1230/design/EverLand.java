package _1230.design;

public class EverLand {
	
		private static EverLand ISTANCE = new EverLand();
		private EverLand() {}
		public static Singleton getInstance () {
			return ISTANCE;
		}
		public void a() {}
}
