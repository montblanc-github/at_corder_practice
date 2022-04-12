A,B = gets.split.map(&:to_i)

count = 0

for i in A..B do
    s = i.to_s
    count +=1 if s == s.reverse
end

puts count

# 今回は関係ないが、空文字が含まれる場合は、空文字を除外する記述が必要となる。