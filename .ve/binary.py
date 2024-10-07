def binary_search(array, target):
    left, right = 0, len(array) - 1  # Initialize left and right pointers
    
    while left <= right:  # Continue while there is a valid search interval
        mid = (left + right) // 2  # Calculate the middle index
        
        if array[mid] == target:  # Check if the middle element is the target
            return mid  # Target found, return the index
        elif array[mid] < target:  # If target is greater, ignore left half
            left = mid + 1  # Move left pointer to mid + 1
        else:  # If target is smaller, ignore right half
            right = mid - 1  # Move right pointer to mid - 1
    
    return -1  # Target not found, return -1

# Example usage
array = [12, 13, 14, 15, 16]  # Use a list instead of a set
target = 15
result = binary_search(array, target)

print("Element found at index:", result)  # Output: Element found at index: 3
