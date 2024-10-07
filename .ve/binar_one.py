def binary_search(array,target):
    left,right = 0 , len(array)-1

    while left <= right:
       mid = (left + right) //2

    if array[mid]== target:
        return target
    elif array[mid]< target:
            left = mid+1
    else:
       right = mid-1
    return -1
    
    array ={ 12,13,14,15}
    target = 15
    result = binary_search(array,target)

    print("elements found at index:",result)

       

