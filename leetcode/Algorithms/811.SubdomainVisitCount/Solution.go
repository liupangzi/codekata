import (
	"strings"
	"strconv"
)

func subdomainVisits(cpdomains []string) []string {
	tmp := make(map[string]int)
	for _, cpdomain := range cpdomains {
		pair := strings.Split(cpdomain, " ")
		count, _ := strconv.Atoi(pair[0])
		domain := pair[1]
		for i := len(domain) - 1; i >= 0; i-- {
			if domain[i] == '.' {
				key := domain[i+1:]
				if _, ok := tmp[key]; ok {
					tmp[key] += count
				} else {
					tmp[key] = count
				}
			}
		}

		if _, ok := tmp[domain]; ok {
			tmp[domain] += count
		} else {
			tmp[domain] = count
		}
	}

	result := make([]string, 0)
	for k, v := range tmp {
		result = append(result, strconv.Itoa(v)+" "+k)
	}
	return result
}

