N,S = gets.split.map(&:to_i)
ans = 0

for i in 1..N do
    for j in 1..N do
        ans += 1 if i+j <= S
    end
end

puts ans