A,B,C,X = 4.times.map{gets.to_i}

ans = 0

for i in 0..A
    for j in 0..B
        for k in 0..C
            ans += 1 if i * 500 + j * 100 + k * 50 == X
        end
    end
end

puts ans