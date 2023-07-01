def maximum_files_capacity(c, n, files):
    # Sort files in ascending order of size
    files.sort()
    count = 0
    total_size = 0

    for size in files:
        total_size += size
        if total_size <= c:
            count += 1
        else:
            break

    return count


def main():
    while True:
        c, n, *files = map(int, input().split())
        if c == 0 and n == 0:
            break
        result = maximum_files_capacity(c, n, files)
        print(result)


if __name__ == "__main__":
    main()

