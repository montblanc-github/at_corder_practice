N,A,B = gets.split.map(&:to_i)

ans = N / (A + B) * A
rem = N % (A + B)
ans += [rem, A].min

puts ans