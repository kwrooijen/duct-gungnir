# Duct Gungnir

[![Clojars Project](https://img.shields.io/clojars/v/duct-gunginr.svg)](https://clojars.org/kwrooijen/duct-gungnir)

## Usage

`project.clj`

### Version
[duct-gungnir versions](http://repo.clojars.org/kwrooijen/duct-gungnir/0.0.1-SNAPSHOT/)

```clojure
:dependencies [[kwrooijen/duct-gungnir "0.0.1-xxxxxxxx.yyyyyy-z"]]
```

`config.edn`

```clojure
{:duct.profile/base
 {:duct.sql.gungnir/make-datasource!
  {:adapter       "postgresql"
   :username      "postgres"
   :password      "postgres"
   :database-name "postgres"
   :server-name   "127.0.0.1"
   :port-number   5432}}

 [:duct.gungnir/model :model/user] 
 [:map
  [:user/id {:primary-key true} uuid?]
  [:user/email string?]]

 [:duct.gungnir/model :model/comment] 
 [:map
  [:comment/id {:primary-key true} uuid?]
  [:comment/content string?]]}
```

## Author / License

Released under the [MIT License] by [Kevin William van Rooijen].

[Kevin William van Rooijen]: https://twitter.com/kwrooijen

[MIT License]: https://github.com/kwrooijen/duct-gungnir/blob/master/LICENSE
