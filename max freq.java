	//print the freq of the number > n/3 in an array	
		int arr[] = {1,3,2,5,1,3,1,5,1};
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i = 0; i<arr.length;i++){
		    map.put(arr[i],map.getOrDefault(arr[i], 0) +1);
		}
		
		for(Integer key: map.keySet()){
		    if(map.get(key) > arr.length/3){
		        System.out.println(key);
		    }
		}
