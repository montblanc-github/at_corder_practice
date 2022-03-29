s = gets.to_i
arr = [s]

i = 1
while true
    if s.even?
        s /= 2
    else
        s = 3*s+1
    end

    arr << s

    i += 1

    if (arr.count - arr.uniq.count) > 0
        puts i
        break
    end

end