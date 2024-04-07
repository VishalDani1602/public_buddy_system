import requests
import json
import time

def track_url(url):
    headers = {}

    try:
        response = requests.get(url, headers=headers)
        data = response.json()

        # Write JSON data to a file
        with open(f"{url.split('/')[-2]}_response.json", "w") as file:
            json.dump(data, file, indent=4)

        print(f"Data from {url} saved successfully.")

    except Exception as e:
        print(f"An error occurred for {url}: {e}")



if __name__ == "__main__":
    urls = [
        "https://webservices.umoiq.com/api/pub/v1/agencies/sfmta-cis/routes/5/vehicles?key=0be8ebd0284ce712a63f29dcaf7798c4",
        "https://webservices.umoiq.com/api/pub/v1/agencies/sfmta-cis/routes/31/vehicles?key=0be8ebd0284ce712a63f29dcaf7798c4"
    ]
    while True:
        for url in urls:
            track_url(url)
        time.sleep(5)
