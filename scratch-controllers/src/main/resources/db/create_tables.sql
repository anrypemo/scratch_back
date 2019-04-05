DROP TABLE IF EXISTS public.users_roles;
DROP TABLE IF EXISTS public.roles;
DROP TABLE IF EXISTS public.users;
-- TABLE ROLE
CREATE TABLE IF NOT EXISTS public.roles
(
  id BIGSERIAL PRIMARY KEY NOT NULL,
  name VARCHAR(20) NOT NULL
);
CREATE UNIQUE INDEX role_role_id_uindex ON public.roles (id);

-- TABLE USERS
CREATE TABLE IF NOT EXISTS public.users
(
  id BIGSERIAL PRIMARY KEY NOT NULL,
  username VARCHAR(60) NOT NULL,
  password VARCHAR(80) NOT NULL,
  first_name VARCHAR(60) NOT NULL,
  last_name VARCHAR(60) NOT NULL,
  email VARCHAR(60) NOT NULL
);
CREATE UNIQUE INDEX user_id_uindex ON public.users (id);
CREATE UNIQUE INDEX user_username_uindex ON public.users (username);
CREATE UNIQUE INDEX user_email_uindex ON public.users (email);

CREATE TABLE IF NOT EXISTS public.users_roles
(
  role_id BIGINT NOT NULL,
  user_id BIGINT NOT NULL,
  CONSTRAINT users_role_role_role_id_fk FOREIGN KEY (role_id) REFERENCES roles (id),
  CONSTRAINT users_role_user_id_fk FOREIGN KEY (user_id) REFERENCES users (id)
);

--  ROLES
INSERT INTO public.roles VALUES (111, 'USER');
INSERT INTO public.roles VALUES (222, 'ADMIN');
INSERT INTO public.roles VALUES (333, 'GUEST');

-- USERS
INSERT INTO users VALUES ('101','anry','{brypt}$2a$04$BhzlkwTeus2DYYJZuAwFlO1xe6FpGtgVpmSZOatAK/7hXgGtASeWy','Anna','Rysakova','annrysakova@test.com');
INSERT INTO users VALUES ('102','pemo','{brypt}$2a$04$BhzlkwTeus2DYYJZuAwFlO1xe6FpGtgVpmSZOatAK/7hXgGtASeWy','Petro','Moiseienko','moiseienkopetro@test.com');
INSERT INTO users VALUES ('103','user1','{brypt}$2a$04$BhzlkwTeus2DYYJZuAwFlO1xe6FpGtgVpmSZOatAK/7hXgGtASeWy','UserOne','One','useone@test.com');
INSERT INTO users VALUES ('104','guest1','{brypt}$2a$04$kvbt44bSKTHtN1vo2HmiXuTDqV7nIjPxSJxNdQ73clYQgN0M0HEqW','Guest','One','guestone@test.com');

-- USER - ROLES
INSERT INTO users_roles VALUES (111,103);
INSERT INTO users_roles VALUES (222,101);
INSERT INTO users_roles VALUES (222,102);
INSERT INTO users_roles VALUES (333,104);
