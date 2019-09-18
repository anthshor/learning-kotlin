    var x: Int = 66

    val result = when (x) {
        in 7..11 -> "Junior"
        in 12..16 -> "Senior"
        in 17..18 -> "College"
        in 19..21 -> "University"
        in 22..25 -> "PhD"
        in 26..65 -> "Job"
        in 7..90 -> "Relax"
        else -> "Age outside of range"

    }

    println(result)
