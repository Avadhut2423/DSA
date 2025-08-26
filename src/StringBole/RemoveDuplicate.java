package StringBole;

public class RemoveDuplicate {

	
	//We have a sorted array and we have to count unique elements in the array
		


		public static int dublicate(int[] arr) { 
			
			int i=0;
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[j]>arr[i]) {
					
					i++;
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
			
			return i+1;
			
		}
		public static void main(String[] args) {
			
			int a[]= {0,1,1,1,2,2,3};
			System.out.println(dublicate(a));
		}
	
	}


