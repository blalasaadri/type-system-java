FROM gitpod/workspace-full

COPY .gitpod.bashrc .
RUN cat .gitpod.bashrc >> ~/.bashrc
RUN sdk default java 11.0.2-zulufx
