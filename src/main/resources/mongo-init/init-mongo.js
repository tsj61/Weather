db = db.getSiblingDB("weather_db");

db.createUser({
  user: "app_user",
  pwd: "app_password",
  roles: [
    {
      role: "readWrite",
      db: "weather_db"
    }
  ]
});
