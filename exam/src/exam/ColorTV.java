package exam;

public class ColorTV extends TV {
	
		private int s;
		ColorTV(int size, int s){
			super(size);
			this.s = s;
		}
		
		public void printProperty() {
			System.out.println(getSize() + "인치" + s + "컬러");
		}

		public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();

	}

}
