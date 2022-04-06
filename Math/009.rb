N,S = gets.split.map(&:to_i)
A = gets.split.map(&:to_i)

ans = Array.new(S+1, false)
ans[0] = true

A.each do |i|
    (S-i).downto(0) do |j|
        ans[i+j] = true if ans[j]
    end
end

puts ans[S] ? "Yes" : "No"