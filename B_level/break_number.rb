N = gets.to_i

if N == 1
    puts 1
else
    arr = [64,32,16,8,4,2]
    for i in arr do
        if N >= i
            puts i
            break
        end
    end
end