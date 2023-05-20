from datetime import datetime, timedelta

def parse_time(time_str):
    return datetime.strptime(time_str, "%H:%M")

def find_longest_nap(tasks):
    occupied_intervals = [(parse_time(task[0]), parse_time(task[1])) for task in tasks]
    occupied_intervals.sort(key=lambda x: x[0])

    longest_nap_start = None
    longest_nap_duration = timedelta()

    for i in range(len(occupied_intervals) - 1):
        nap_start = occupied_intervals[i][1]
        nap_end = occupied_intervals[i + 1][0]
        nap_duration = nap_end - nap_start

        if nap_duration > longest_nap_duration:
            longest_nap_start = nap_start
            longest_nap_duration = nap_duration

    return longest_nap_start, longest_nap_duration

def format_output(day, nap_start, nap_duration):
    hours, remainder = divmod(nap_duration.seconds, 3600)
    minutes = remainder // 60
    if hours > 0:
        return f"Dia #{day}: a maior soneca comeca as {nap_start.strftime('%H:%M')} e durara {hours} horas e {minutes} minutos."
    else:
        return f"Dia #{day}: a maior soneca comeca as {nap_start.strftime('%H:%M')} e durara {minutes} minutos."

day = 1
while True:
    try:
        n = int(input())
        tasks = [input().split()[:2] for _ in range(n)]
        if tasks[0][0] != "10:00":
            tasks.append(["10:00", "10:00"])

        if tasks[len(tasks)-1][1] != "18:00":
            tasks.append(["18:00", "18:00"])
        nap_start, nap_duration = find_longest_nap(tasks)
        print(format_output(day, nap_start, nap_duration))
        day += 1
    except EOFError:
        break
