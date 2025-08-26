package StringBole;

public class MergeSortedArray {
	
	
	public static void mergeSort(int[] nums1,int[] nums2,int m,int n) {
		
		int i=m-1;
		int j=n-1;
		int x=m+n-1;
		
		while(i>=0 && j>=0) {
			if(nums1[i]>nums2[j]) {
				nums1[x]=nums1[i];
				x--;i--;
			}
			else {
				nums1[x]=nums2[j];
				x--;j--;
			}
			
		}
		
		while(j>=0) {
			nums1[x]=nums2[j];
			x--;j--;
		}
		
		for(int k=0;k<nums1.length;k++) {
			System.out.print(nums1[k]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=3;
		int n=3;
		
		int arr[]= {7,8,9,0,0,0};
		int arr1[]= {1,2,3};
		
		mergeSort(arr,arr1,m,n);
		
	}

}
