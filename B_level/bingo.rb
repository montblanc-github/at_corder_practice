A = 3.times.map{gets.split.map(&:to_i)}

bingo = Array.new(3){Array.new(3,false)}

gets.to_i.times do
    b = gets.to_i
    3.times do |i|
        3.times do |j|
            bingo[i][j] = true if A[i][j] == b
        end
    end
end

ans = false

3.times do |i|
    ans = true if bingo[i][0] && bingo[i][1] && bingo[i][2]
    ans = true if bingo[0][i] && bingo[1][i] && bingo[2][i]
end

ans = true if bingo[0][0] && bingo[1][1] && bingo[2][2]
ans = true if bingo[0][2] && bingo[1][1] && bingo[2][0]

puts ans ? "Yes" : "No"