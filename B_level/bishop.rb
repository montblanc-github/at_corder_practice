H,W = gets.split.map(&:to_i)

if H==1 || W==1
    puts 1
else
    puts (H*W+1)/2
end