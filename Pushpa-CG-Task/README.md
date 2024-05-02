# Pushpa-CG-Task
Logic Building and Spring Boot Framework.

class task {
			
		    public int[] twoSum(int[] nums, int target) {
		        int arr[] = new int[1];
		      
		        HashMap<Integer,Integer> map = new HashMap<>();
		        for(int i = 0;i<nums.length;i++){
		          
		            if(map.containsKey(nums[i])){
		                arr[0] = map.get(nums[i]);
		                arr[1] = i;
		               
		                 return arr;
		            }
		            else{
		                // (target - value) -> remaining value which is equal to target sum 
		                map.put((target - nums[i]), i);
		            }
		        }
		        return arr;
		    }
		}


