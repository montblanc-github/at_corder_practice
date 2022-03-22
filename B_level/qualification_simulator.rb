N,A,B = gets.split.map(&:to_i)
S = gets.chars

passing_count = 1
abroad_count = 0

S.map do |i|
    if i == "c"
        puts "No"
    elsif i == "a"
        if passing_count <= A+B
            puts "Yes"
            passing_count += 1
        else
            puts "No"
        end
    elsif i == "b"
        if passing_count <= A+B && abroad_count < B
            puts "Yes"
            passing_count += 1
            abroad_count += 1
        else
            puts "No"
        end
    end
end