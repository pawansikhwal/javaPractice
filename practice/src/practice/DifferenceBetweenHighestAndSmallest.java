package practice;

public class DifferenceBetweenHighestAndSmallest {
	static String as="";
	static String bs= new String("");
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,5343,5534,56,445,5};
		difference(a);
		DifferenceBetweenHighestAndSmallest differenceBetweenHighestAndSmallest = new DifferenceBetweenHighestAndSmallest();
		differenceBetweenHighestAndSmallest.checkString(as,bs);
		
	}

	private static void difference(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
//		sortPrint(a);
		System.out.println(a[a.length-1]-a[0]);
		
	}
	public void checkString(String a , String b) {
		
		System.out.println(a==b);
		bs=null;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
	}
	

	
	private static void sortPrint(int[] arr ){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+", ");
		}
	}

}
