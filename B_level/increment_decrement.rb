N = gets.to_i
S = gets.chomp.chars
x = 0
ans = [0]

N.times do |i|
    if S[i] == "I"
        x += 1
    else
        x -= 1
    end
    ans << x
    i += 1
end

puts ans.max