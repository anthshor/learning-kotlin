    outer@for () {
        for () {
            if (<condition>) {
                break@outer
            }
            stuff when condition is false
        }
        default break would send here
    }
    
    named break 'outer' sends here
