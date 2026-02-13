# Use an existing image as a base
FROM docker.io/node:25-alpine

# Create a Work Directory
WORKDIR /usr/app
#copy file
COPY ./ ./
 
# Download and install a dependency
RUN npm install 
 
# Tell the image what to do when it starts
# as a container
CMD ["npm", "start"]