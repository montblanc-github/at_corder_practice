a,b,c,k = gets.split.map(&:to_i)

ans = k.even? ? a-b : b-a

puts ans > 10**18 ? "Unfair" : ans