N = gets.to_i

D,X = gets.split.map(&:to_i)

ans = []

N.times do
    a = gets.to_i

    if D%a == 0
        ans << D/a
    else
        ans << D/a+1
    end
end

puts ans.sum + X